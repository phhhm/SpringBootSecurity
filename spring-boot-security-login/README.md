
Methods 	    Urls	                     Actions
POST    	/api/auth/signup	        signup new account
POST    	/api/auth/signin	        login an account
POST    	/api/auth/signout	        logout the account
GET 	    /api/test/all	            retrieve public content
GET 	    /api/test/user	            access User’s content
GET 	    /api/test/mod	            access Moderator’s content
GET 	    /api/test/admin	            access Admin’s content

1- first of all after running the project add Roles to DB with this scripts:
    INSERT INTO roles(name) VALUES('ROLE_USER');
    INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
    INSERT INTO roles(name) VALUES('ROLE_ADMIN');

2- use '/api/auth/signup' url to create a user 
3- sign in with this url '/api/auth/signin'
4- you can test your access with this urls :
    /api/test/all
    /api/test/user
    /api/test/mod
    /api/test/admin
5- and at the end you can sign out with this url '/api/auth/signout'

also you can connect your ui to this application