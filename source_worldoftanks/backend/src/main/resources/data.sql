-- Lozinke su hesovane pomocu BCrypt algoritma https://www.dailycred.com/article/bcrypt-calculator
-- Lozinka je 123
INSERT INTO USER (id, username, password, balance, discount, enabled) VALUES (1, 'user1','$2a$04$Vbug2lwwJGrvUXTj6z7ff.97IzVBkrJ1XfApfGNl.Z695zqcnPYra',10000,false, true);
INSERT INTO AUTHORITY (id, name) VALUES (1, 'ROLE_USER');
INSERT INTO USER_AUTHORITY (user_id, authority_id) VALUES (1, 1);

INSERT INTO TANK (id, name, tank_type, damage, penetration, reload_time, top_speed, health, armor, view_range) VALUES (1, 'Skropion G','DESTROYER',490,246,12,60,1150,70,360);
INSERT INTO TANK (id, name, tank_type, damage, penetration, reload_time, top_speed, health, armor, view_range) VALUES (2, 'Progetto','MEDIUM',240,212,8,55,1200,60,390);
INSERT INTO TANK (id, name, tank_type, damage, penetration, reload_time, top_speed, health, armor, view_range) VALUES (3, 'MAUS','HEAVY',490,246,13,20,3000,200,400);
INSERT INTO TANK (id, name, tank_type, damage, penetration, reload_time, top_speed, health, armor, view_range) VALUES (4, 'EBR','LIGHT',100,190,5,80,1500,70,500);


INSERT INTO USER_TANK(user_id,tank_id) VALUES (1,1);
INSERT INTO USER_TANK(user_id,tank_id) VALUES (1,2);
INSERT INTO USER_TANK(user_id,tank_id) VALUES (1,3);


INSERT INTO PLAYER_STATISTICS(id,avg_damage,win_rate,gun_mark) VALUES (1,2300,67,True);