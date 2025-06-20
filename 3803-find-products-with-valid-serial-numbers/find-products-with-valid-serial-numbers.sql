select * from products
where description Regexp '\\bSN[0-9]{4}-[0-9]{4}\\b'