 CREATE TABLE invoices (
    id SERIAL PRIMARY KEY,
    buyer_party_id VARCHAR(50) NOT NULL,
    supplier_party_id VARCHAR(50) NOT NULL,
    amount DECIMAL(15,2) NOT NULL,
    invoice_date DATE NOT NULL,
    maturity_date DATE NOT NULL,
    description_of_goods TEXT
);