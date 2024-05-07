import java.util.Scanner;

class CacheMapping {
    public int cacheLines;
    public int memoryBlocks;
    public int cache[];
    public Scanner scanner = new Scanner(System.in);
    public int nextInd = 0;
    public int nextInd1 = 0;

    public CacheMapping(int cacheL, int memoryB) {
        this.cacheLines = cacheL;
        this.memoryBlocks = memoryB;
        this.cache = new int[this.cacheLines];
    }

    public void printCache() {
        System.out.println("The cache lines stored are: ");
        for (int i = 0; i < this.cache.length; i++) {
            System.out.print(this.cache[i] + "  ");
        }
    }

    public void direct(int memoryLine) throws ArrayIndexOutOfBoundsException {
        // direct mapping
        // memory block x is stored at cache line x % l, where l is number cache lines
        int cacheInd = memoryLine % this.cacheLines;
        if (this.cache[cacheInd] != 0) {
            System.out.println("Replacing memory line " + this.cache[cacheInd] + " from cache");
        }
        this.cache[cacheInd] = memoryLine;
        this.printCache();
    }

    public void associative(int memoryLine) throws ArrayIndexOutOfBoundsException {
        // associative mapping
        int cacheInd = 0;
        if (this.nextInd >= this.cache.length) {
            this.nextInd = 0;
        }

        cacheInd = this.nextInd;
        this.cache[cacheInd] = memoryLine;
        this.nextInd++;

        this.printCache();
    }

    public void setAssociative(int memoryLine) throws ArrayIndexOutOfBoundsException {
        // set associative mapping
        // 2 * (memoryLine % cacheLines) and 2 * (memoryLine % cacheLines) + 1
        int OGind = 2 * (memoryLine % (this.cacheLines / 2));
        this.nextInd1 = OGind;
        // System.out.println(nextInd1);

        if (this.cache[nextInd1] != 0) {
            nextInd1++;
        } else if (this.cache[nextInd1] != 0) {
            nextInd1++;
        }
        if (this.nextInd1 >= (OGind + 2)) {
            this.nextInd1 = OGind;
        }

        // System.out.println(nextInd1);
        this.cache[nextInd1] = memoryLine;
        // nextInd++;
        this.printCache();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int memoryLine;

        System.out.print("Enter the number of lines in cache block: ");
        int cacheLines = scanner.nextInt();

        System.out.print("Enter the number of blocks in memory: ");
        int memoryBlocks = scanner.nextInt();

        System.out.println("\n1 - Direct");
        System.out.println("2 - Associative");
        System.out.println("3 - Set-Associative");
        System.out.println("0 - Exit");
        System.out.print("Enter the choice for cache mapping: ");
        int ch = scanner.nextInt();

        CacheMapping cache = new CacheMapping(cacheLines, memoryBlocks);

        do {
            System.out.print("\nEnter the line from memory to load (Enter -1 to end simulation): ");
            memoryLine = scanner.nextInt();
            try {
                switch (ch) {
                    case 1:
                        cache.direct(memoryLine);
                        break;

                    case 2:
                        cache.associative(memoryLine);
                        break;

                    case 3:
                        cache.setAssociative(memoryLine);
                        break;

                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ending simulation...");
            }
        } while (memoryLine != -1);
        scanner.close();
    }
}