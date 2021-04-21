/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  romai
 * Created: 18 avr. 2021
 */

INSERT INTO Salle(id, nom, p_index) VALUES 
    (1, 'Salle1', 15),
    (2, 'Salle2', 17),
    (3, 'Salle3', 18),
    (4, 'Salle4', 11),
    (5, 'Salle5', 19);

INSERT INTO Capteur_Bruit(bruit_index, salle_bruit_id, date_mesure) VALUES 
    (45, 3, TO_DATE('2020-04-20 23:59:45', 'YYYY-MM-DD HH:MI:SS')),
    (17, 3, TO_DATE('2020-04-20 21:55:40', 'YYYY-MM-DD HH:MI:SS')),
    (18, 3, TO_DATE('2020-04-20 20:32:40', 'YYYY-MM-DD HH:MI:SS')),
    (29, 2, TO_DATE('2020-04-20 17:59:45', 'YYYY-MM-DD HH:MI:SS')),
    (35, 2, TO_DATE('2020-04-20 18:45:30', 'YYYY-MM-DD HH:MI:SS')),
    (25, 2, TO_DATE('2020-04-20 19:39:45', 'YYYY-MM-DD HH:MI:SS')),
    (14, 2, TO_DATE('2020-04-20 20:25:30', 'YYYY-MM-DD HH:MI:SS')),
    (12, 2, TO_DATE('2020-04-20 21:19:45', 'YYYY-MM-DD HH:MI:SS')),
    (51, 4, TO_DATE('2020-04-20 23:59:45', 'YYYY-MM-DD HH:MI:SS')),
    (29, 1, TO_DATE('2020-04-20 23:59:45', 'YYYY-MM-DD HH:MI:SS')),
    (85, 4, TO_DATE('2020-04-20 21:30:46', 'YYYY-MM-DD HH:MI:SS'));

INSERT INTO Capteur_Humidite(humidite_index, salle_humidite_id, date_mesure) VALUES 
    (15, 3, TO_DATE('2020-04-20 23:59:45', 'YYYY-MM-DD HH:MI:SS')),
    (32, 2, TO_DATE('2020-04-20 17:59:45', 'YYYY-MM-DD HH:MI:SS')),
    (5, 2, TO_DATE('2020-04-20 18:45:30', 'YYYY-MM-DD HH:MI:SS')),
    (23, 2, TO_DATE('2020-04-20 19:39:45', 'YYYY-MM-DD HH:MI:SS')),
    (10, 2, TO_DATE('2020-04-20 20:25:30', 'YYYY-MM-DD HH:MI:SS')),
    (22, 2, TO_DATE('2020-04-20 21:19:45', 'YYYY-MM-DD HH:MI:SS')),
    (31, 4, TO_DATE('2020-04-20 13:40:45', 'YYYY-MM-DD HH:MI:SS')),
    (29, 1, TO_DATE('2020-04-20 13:40:45', 'YYYY-MM-DD HH:MI:SS')),
    (15, 4, TO_DATE('2020-04-20 12:25:45', 'YYYY-MM-DD HH:MI:SS'));

INSERT INTO Capteur_Temperature(temperature_index, salle_temperature_id, date_mesure) VALUES 
    (20, 3, TO_DATE('2020-04-20 23:59:45', 'YYYY-MM-DD HH:MI:SS')),
    (21, 2, TO_DATE('2020-04-20 17:59:45', 'YYYY-MM-DD HH:MI:SS')),
    (16, 2, TO_DATE('2020-04-20 18:45:30', 'YYYY-MM-DD HH:MI:SS')),
    (30, 2, TO_DATE('2020-04-20 19:39:45', 'YYYY-MM-DD HH:MI:SS')),
    (20, 2, TO_DATE('2020-04-20 20:25:30', 'YYYY-MM-DD HH:MI:SS')),
    (10, 2, TO_DATE('2020-04-20 21:19:45', 'YYYY-MM-DD HH:MI:SS')),
    (15, 1, TO_DATE('2020-04-20 15:59:30', 'YYYY-MM-DD HH:MI:SS')),
    (30, 4, TO_DATE('2020-04-20 13:40:45', 'YYYY-MM-DD HH:MI:SS'));    

INSERT INTO Capteur_Lumiere(lumiere_index, salle_lumiere_id, date_mesure) VALUES 
    (260, 3, TO_DATE('2020-04-20 23:59:45', 'YYYY-MM-DD HH:MI:SS')),
    (25, 2, TO_DATE('2020-04-20 17:59:45', 'YYYY-MM-DD HH:MI:SS')),
    (90, 2, TO_DATE('2020-04-20 18:45:30', 'YYYY-MM-DD HH:MI:SS')),
    (100, 2, TO_DATE('2020-04-20 19:39:45', 'YYYY-MM-DD HH:MI:SS')),
    (53, 2, TO_DATE('2020-04-20 20:25:30', 'YYYY-MM-DD HH:MI:SS')),
    (250, 2, TO_DATE('2020-04-20 21:19:45', 'YYYY-MM-DD HH:MI:SS')),
    (600, 1, TO_DATE('2020-04-20 13:40:45', 'YYYY-MM-DD HH:MI:SS')),
    (1505, 4, TO_DATE('2020-04-20 21:30:46', 'YYYY-MM-DD HH:MI:SS')),
    (765, 4, TO_DATE('2020-04-20 14:15:45', 'YYYY-MM-DD HH:MI:SS'));

