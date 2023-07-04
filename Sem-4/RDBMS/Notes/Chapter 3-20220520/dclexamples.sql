CREATE USER manisha WITH PASSWORD 'manisha';

GRANT ALL ON person TO manisha;

GRANT ALL ON test TO manisha;

-- a particular table right is given to how many users can be seen 


SELECT grantee, privilege_type 
FROM information_schema.role_table_grants 
WHERE table_name='person'


REVOKE ALL ON person FROM manisha;

REVOKE ALL ON test FROM manisha;

-- grant only insert operation to user
GRANT INSERT ON test TO manisha;



 drop user manisha


-- tables rights to user

SELECT table_catalog, table_schema, table_name, privilege_type
FROM   information_schema.table_privileges 
WHERE  grantee = 'manisha'



--try following

GRANT SELECT ON mytable TO PUBLIC;
GRANT SELECT, UPDATE, INSERT ON mytable TO admin;
GRANT SELECT (col1), UPDATE (col1) ON mytable TO miriam_rw;



-- Grant membership in role admins to user joe:

GRANT admins TO joe;



-- https://support.chartio.com/knowledgebase/creating-a-user-with-pgadmin