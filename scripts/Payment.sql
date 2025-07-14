CREATE TABLE payments (
    id                 VARCHAR(200) PRIMARY KEY,                 -- system surrogate
    buyer_party_id     VARCHAR(200) NOT NULL,                    -- FK → parties(id)
    supplier_party_id  VARCHAR(200) NOT NULL,                    -- FK → parties(id)
    amount             DECIMAL(10,2) NOT NULL CHECK (amount >= 0),
    rate_of_interest   DECIMAL(10,2),                            -- newly added column as per instruction
    payment_date       DATE NOT NULL,
    debit_account_id   VARCHAR(200) NOT NULL,                    -- FK → accounts(id), changed from BIGINT
    credit_account_id  VARCHAR(200) NOT NULL,                    -- FK → accounts(id), changed from BIGINT
    payment_type       VARCHAR(20) NOT NULL
                         CHECK (payment_type IN ('DISCOUNT_PAYMENT', 'LOAN_REPAYMENT')),

    -- MySQL-compatible audit columns
    created_at         DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_at         DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
