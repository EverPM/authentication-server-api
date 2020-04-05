INSERT INTO oauth_client_details
    (client_id, client_secret, scope, authorized_grant_types,
    web_server_redirect_uri, authorities, access_token_validity,
    refresh_token_validity, additional_information, autoapprove)
VALUES
    ('client', '$2a$10$w9/1hWUMTbB9eeldUARlEOcTH3Wn.0WplhGgJ9st8Pkzf9X.XDXtS', 'read,write',
    'password,authorization_code,refresh_token', null, null, 36000, 36000, null, true);

--     $2a$10$w9/1hWUMTbB9eeldUARlEOcTH3Wn.0WplhGgJ9st8Pkzf9X.XDXtS  bcrypt encoded 'secret'