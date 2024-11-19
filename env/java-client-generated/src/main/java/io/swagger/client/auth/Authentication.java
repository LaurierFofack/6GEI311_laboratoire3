/*
 * API de Gestion des Cours en Ligne - OpenAPI 3.0
 * Ceci est une API permettant de gérer le contenu des cours en ligne. Elle expose des fonctionnalités pour créer, consulter, mettre à jour, et supprimer des cours et leurs séances. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@exemple.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.auth;

import io.swagger.client.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     *
     * @param queryParams List of query parameters
     * @param headerParams Map of header parameters
     */
    void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
