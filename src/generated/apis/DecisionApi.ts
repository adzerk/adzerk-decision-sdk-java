/* tslint:disable */
/* eslint-disable */
/**
 * Adzerk Decision API
 * Adzerk Decision API
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as runtime from '../runtime';
import {
    DecisionRequest,
    DecisionRequestFromJSON,
    DecisionRequestToJSON,
    DecisionResponse,
    DecisionResponseFromJSON,
    DecisionResponseToJSON,
} from '../models';

export interface GetDecisionsRequest {
    decisionRequest?: DecisionRequest;
}

/**
 * 
 */
export class DecisionApi extends runtime.BaseAPI {

    /**
     * Request Decision(s)
     */
    async getDecisionsRaw(requestParameters: GetDecisionsRequest): Promise<runtime.ApiResponse<DecisionResponse>> {
        const queryParameters: runtime.HTTPQuery = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        const response = await this.request({
            path: `/api/v2`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: DecisionRequestToJSON(requestParameters.decisionRequest),
        });

        return new runtime.JSONApiResponse(response, (jsonValue) => DecisionResponseFromJSON(jsonValue));
    }

    /**
     * Request Decision(s)
     */
    async getDecisions(decisionRequest?: DecisionRequest): Promise<DecisionResponse> {
        const response = await this.getDecisionsRaw({ decisionRequest: decisionRequest });
        return await response.value();
    }

}
