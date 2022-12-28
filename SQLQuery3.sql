SELECT COUNT(IDTranzactie) as 'Trazanctii'
FROM Tranzactii
WHERE IDClienti = 1


SELECT COUNT(IDTranzactie) as 'Trazanctii'
FROM Tranzactii
WHERE IDClienti = 1 AND IDProdus = 123;


SELECT COUNT(IDTranzactie) as 'Trazanctii'
FROM Tranzactii
WHERE IDClienti = 1 AND IDProdus = 105;

SELECT COUNT(IDTranzactie) as 'PRODUSE CUMPARATE'
FROM Tranzactii
WHERE IDClienti = 1 AND IDProdus = 124;

SELECT COUNT(IDTranzactie) as 'PRODUSE CUMPARATE'
FROM Tranzactii
WHERE IDClienti = 1 AND IDProdus = 105;