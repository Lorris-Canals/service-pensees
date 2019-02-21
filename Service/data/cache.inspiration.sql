--
-- File generated with SQLiteStudio v3.2.1 on jeu. févr. 21 16:49:10 2019
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: pensee
CREATE TABLE pensee (idPensee BIGINT PRIMARY KEY, auteur VARCHAR (255), message TEXT, annee BIGINT, source TEXT);
INSERT INTO pensee (idPensee, auteur, message, annee, source) VALUES (1, 'Douglas Kennedy', 'L experience est le mot par lequel les hommes designent leurs erreurs.', NULL, NULL);
INSERT INTO pensee (idPensee, auteur, message, annee, source) VALUES (2, 'George Orwell', 'The Truth is Heresy in the Empire of lies.', NULL, NULL);
INSERT INTO pensee (idPensee, auteur, message, annee, source) VALUES (3, 'St-Exupery', 'Faites que le reve devore votre vie afin que la vie ne devore pas votre reve.', NULL, NULL);
INSERT INTO pensee (idPensee, auteur, message, annee, source) VALUES (4, 'Leonardo da Vinci', 'Once you have tasted the taste of sky, you will forever look up.\r\n', NULL, NULL);
INSERT INTO pensee (idPensee, auteur, message, annee, source) VALUES (NULL, 'coucou', 'coucou', NULL, NULL);
INSERT INTO pensee (idPensee, auteur, message, annee, source) VALUES (NULL, 'coucou', 'coucou', NULL, NULL);
INSERT INTO pensee (idPensee, auteur, message, annee, source) VALUES (NULL, 'coucou', 'coucou', NULL, NULL);
INSERT INTO pensee (idPensee, auteur, message, annee, source) VALUES (NULL, 'coucou', 'coucou', NULL, NULL);
INSERT INTO pensee (idPensee, auteur, message, annee, source) VALUES (NULL, 'coucou', 'coucou', NULL, NULL);
INSERT INTO pensee (idPensee, auteur, message, annee, source) VALUES (NULL, 'coucou', 'coucou', NULL, NULL);
INSERT INTO pensee (idPensee, auteur, message, annee, source) VALUES (NULL, 'coucou', 'coucou', NULL, NULL);
INSERT INTO pensee (idPensee, auteur, message, annee, source) VALUES (NULL, 'coucou', 'coucou', NULL, NULL);
INSERT INTO pensee (idPensee, auteur, message, annee, source) VALUES (NULL, 'coucou', 'coucou', NULL, NULL);

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
