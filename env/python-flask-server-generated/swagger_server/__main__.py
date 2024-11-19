#!/usr/bin/env python3

import connexion

from swagger_server import encoder


def main():
    app = connexion.FlaskApp(__name__, specification_dir='./swagger/')
    app.app.json_encoder = encoder.JSONEncoder
    app.add_api('swagger.yaml', arguments={'title': 'API de Gestion des Cours en Ligne - OpenAPI 3.0'})
    app.run(port=5000, debug=True)


if __name__ == '__main__':
    main()


