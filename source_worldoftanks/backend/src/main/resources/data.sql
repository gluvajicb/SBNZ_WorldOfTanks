-- Lozinke su hesovane pomocu BCrypt algoritma https://www.dailycred.com/article/bcrypt-calculator
-- Lozinka je 123
INSERT INTO USER (id, username, password, balance, discount, enabled) VALUES (1, 'user1','$2a$04$Vbug2lwwJGrvUXTj6z7ff.97IzVBkrJ1XfApfGNl.Z695zqcnPYra',10000,false, true);
INSERT INTO AUTHORITY (id, name) VALUES (1, 'ROLE_USER');
INSERT INTO USER_AUTHORITY (user_id, authority_id) VALUES (1, 1);

