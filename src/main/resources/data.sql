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

INSERT INTO Capteur_Bruit(bruit_index, salle_bruit_id) VALUES 
    (15, 3),
    (17, 3),
    (25, 2),
    (12, 2),
    (51, 4),
    (55, 4);

INSERT INTO Capteur_Humidite(humidite_index, salle_humidite_id) VALUES 
    (15, 3),
    (30, 2),
    (31, 4),
    (33, 4);

INSERT INTO Capteur_Temperature(temperature_index, salle_temperature_id) VALUES 
    (20, 3),
    (11, 2),
    (20, 4);    

INSERT INTO Capteur_Lumiere(lumiere_index, salle_lumiere_id) VALUES 
    (16, 3),
    (13, 2),
    (16, 4),
    (11, 4);

