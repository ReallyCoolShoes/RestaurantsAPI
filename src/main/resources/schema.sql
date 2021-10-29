DROP TABLE IF EXISTS RESTAURANT;
DROP TABLE IF EXISTS RESTAURANTS;

-- auto_increment combined with  @GeneratedValue(strategy = GenerationType.IDENTITY) on the model works
-- for auto incrementing the primary key
CREATE TABLE RESTAURANTS(
    id INT auto_increment PRIMARY KEY,
    name VARCHAR(50),
    cuisine VARCHAR(50) NOT NULL
);