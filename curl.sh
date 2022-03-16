curl -L --request POST \
--url 'http://localhost:8000/api/api-token-auth/' \
--header 'content-type: application/json' \
--data '{
    "username": "superadmin",
    "password":"ThisIs@SecurePassw0rd"
}' \
