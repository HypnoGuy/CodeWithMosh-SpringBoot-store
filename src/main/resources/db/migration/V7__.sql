ALTER TABLE store.products
    ADD `description` TEXT NULL;

ALTER TABLE products
    MODIFY `description` TEXT NOT NULL;