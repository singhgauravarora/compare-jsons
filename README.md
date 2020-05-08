1.) Run the java application.
2.) Authenticate yourself to get the JWT token.

curl --location --request POST 'http://localhost:8080/user' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--header 'Cookie: JSESSIONID=D1B3BCDC234C0898C81D51E0495A942B' \
--data-urlencode 'user=gaurav' \
--data-urlencode 'password=pwd'

You will get JWT token. Use this token in all subsequent requests in Authorization Header.

3. )
Add Base Json data using below API 

curl --location --request POST 'http://localhost:8080/v1/json-data' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJzb2Z0dGVrSldUIiwic3ViIjoiZ2F1cmF2IiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9VU0VSIl0sImlhdCI6MTU4ODg2MTMwMSwiZXhwIjoxNTg4ODYxOTAxfQ.j6-jt8ZByfYXma5gt3cwNRUHYApC9GcxkSPoiQ4lqLGkwY7uNNBtSdNcaA9bGtK7ybpkf_JNSTgzyMO6jvlWlg' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=D1B3BCDC234C0898C81D51E0495A942B' \
--data-raw '{
	"status": "SUCCESS",
	"content": [
		
		{
			"apiConnectionDefnId": null,
			"apiPath": "hjshj",
			"name": "DepartmentDivisions",
			"label": "DepartmentDivisions",
			"description": "departmentDivision",
			"version": 1.0,
			"activeFlag": false,
			"type": "USER_DEFINED",
			"tenantId": "pX2e1e12c31",
			"apiHeaders": {
				
			},
			"apiConnectionDefn": null,
			"baseMasterDataDefnId": null,
			"objectDefn": null,
			"fields": {
				"deptDivId": {
					"name": "deptDivId",
					"label": "Association ID",
					"description": "deptDivId",
					"dataTypeDefnId": "TEXT",
					"dataTypeDefn": {
						"dataTypeDefnId": "TEXT",
						"name": "Text",
						"parameterDefns": []
					},
					"dataTypeDefnParameters": {
						
					},
					"sequence": 1.0,
					"searchableFlag": false,
					"deletedFlag": false,
					"primaryKeyFlag": true,
					"uniqueKeyFlag": false,
					"nullableFlag": false,
					"tenantId": "pX2e1e12c31",
					"localizedFlag": false
				},
				"deptId": {
					"name": "deptId",
					"label": "department Id",
					"description": "deptId",
					"dataTypeDefnId": "TEXT",
					"dataTypeDefn": {
						"dataTypeDefnId": "TEXT",
						"name": "Text",
						"parameterDefns": []
					},
					"dataTypeDefnParameters": {
						
					},
					"sequence": 2.0,
					"searchableFlag": false,
					"deletedFlag": false,
					"primaryKeyFlag": false,
					"uniqueKeyFlag": false,
					"nullableFlag": false,
					"tenantId": "pX2e1e12c31",
					"localizedFlag": false
				},
				"divId": {
					"name": "divId",
					"label": "division Id",
					"description": "divId",
					"dataTypeDefnId": "TEXT",
					"dataTypeDefn": {
						"dataTypeDefnId": "TEXT",
						"name": "Text",
						"parameterDefns": []
					},
					"dataTypeDefnParameters": {
						
					},
					"sequence": 3.0,
					"searchableFlag": false,
					"deletedFlag": false,
					"primaryKeyFlag": false,
					"uniqueKeyFlag": false,
					"nullableFlag": false,
					"tenantId": "pX2e1e12c31",
					"localizedFlag": false
				}
			}
		},
		{
			"apiConnectionDefnId": null,
			"apiPath": null,
			"name": "Division",
			"label": "division",
			"description": "division",
			"version": 1.0,
			"activeFlag": false,
			"type": "USER_DEFINED",
			"tenantId": "pX2e1e12c31",
			"apiHeaders": {
				
			},
			"apiConnectionDefn": null,
			"baseMasterDataDefnId": null,
			"objectDefn": null,
			"fields": {
				"divId": {
					"name": "divId",
					"label": "division Id",
					"description": "divId",
					"dataTypeDefnId": "TEXT",
					"dataTypeDefn": {
						"dataTypeDefnId": "TEXT",
						"name": "Text",
						"parameterDefns": []
					},
					"dataTypeDefnParameters": {
						
					},
					"sequence": 1.0,
					"searchableFlag": false,
					"deletedFlag": false,
					"primaryKeyFlag": true,
					"uniqueKeyFlag": false,
					"nullableFlag": false,
					"tenantId": "pX2e1e12c31",
					"localizedFlag": false
				},
				"name": {
					"name": "name",
					"label": "name",
					"description": "name",
					"dataTypeDefnId": "TEXT",
					"dataTypeDefn": {
						"dataTypeDefnId": "TEXT",
						"name": "Text",
						"parameterDefns": []
					},
					"dataTypeDefnParameters": {
						
					},
					"sequence": 2.0,
					"searchableFlag": false,
					"deletedFlag": false,
					"primaryKeyFlag": false,
					"uniqueKeyFlag": false,
					"nullableFlag": false,
					"tenantId": "pX2e1e12c31",
					"localizedFlag": false
				},
				"deptId": {
					"name": "deptId",
					"label": "Department ID ",
					"description": "Department Id",
					"dataTypeDefnId": "TEXT",
					"dataTypeDefn": {
						"dataTypeDefnId": "TEXT",
						"name": "Text",
						"parameterDefns": []
					},
					"dataTypeDefnParameters": {
						
					},
					"sequence": 3.0,
					"searchableFlag": false,
					"deletedFlag": false,
					"primaryKeyFlag": false,
					"uniqueKeyFlag": false,
					"nullableFlag": false,
					"tenantId": "pX2e1e12c31",
					"localizedFlag": false
				}
			}
		}
	],
	"messages": []
}'

4.) Get Api to get the saved base Json data  

curl --location --request GET 'http://localhost:8080/v1/json-data/1' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJzb2Z0dGVrSldUIiwic3ViIjoiZ2F1cmF2IiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9VU0VSIl0sImlhdCI6MTU4ODg2MTMwMSwiZXhwIjoxNTg4ODYxOTAxfQ.j6-jt8ZByfYXma5gt3cwNRUHYApC9GcxkSPoiQ4lqLGkwY7uNNBtSdNcaA9bGtK7ybpkf_JNSTgzyMO6jvlWlg' \
--header 'Cookie: JSESSIONID=D1B3BCDC234C0898C81D51E0495A942B'

5.) Delete Api to delete the saved base json
curl --location --request DELETE 'http://localhost:8080/v1/json-data/1' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJzb2Z0dGVrSldUIiwic3ViIjoiZ2F1cmF2IiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9VU0VSIl0sImlhdCI6MTU4ODg2MTMwMSwiZXhwIjoxNTg4ODYxOTAxfQ.j6-jt8ZByfYXma5gt3cwNRUHYApC9GcxkSPoiQ4lqLGkwY7uNNBtSdNcaA9bGtK7ybpkf_JNSTgzyMO6jvlWlg' \
--header 'Cookie: JSESSIONID=D1B3BCDC234C0898C81D51E0495A942B'

6.) Put Api to update the existing base json 

curl --location --request PUT 'http://localhost:8080/v1/json-data/1' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJzb2Z0dGVrSldUIiwic3ViIjoiZ2F1cmF2IiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9VU0VSIl0sImlhdCI6MTU4ODg2MTMwMSwiZXhwIjoxNTg4ODYxOTAxfQ.j6-jt8ZByfYXma5gt3cwNRUHYApC9GcxkSPoiQ4lqLGkwY7uNNBtSdNcaA9bGtK7ybpkf_JNSTgzyMO6jvlWlg' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=D1B3BCDC234C0898C81D51E0495A942B' \
--data-raw '{
	"status": "SUCCESS"
}'

7.) GET API to get the difference between the jsons passed in request body and the base json stored against id. 

curl --location --request GET 'http://localhost:8080/v1/json-data/compare-jsons/1' \
--header 'Authorization: --header '\''Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJzb2Z0dGVrSldUIiwic3ViIjoiZ2F1cmF2IiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9VU0VSIl0sImlhdCI6MTU4ODg2MTMwMSwiZXhwIjoxNTg4ODYxOTAxfQ.j6-jt8ZByfYXma5gt3cwNRUHYApC9GcxkSPoiQ4lqLGkwY7uNNBtSdNcaA9bGtK7ybpkf_JNSTgzyMO6jvlWlg'\'' \' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=D1B3BCDC234C0898C81D51E0495A942B' \
--data-raw '{
	"status": "SUCCESS",
	"content": [
		
		{
			"apiConnectionDefnId": null,
			"apiPath": "hjshj",
			"name": "DepartmentDivisions",
			"label": "DepartmentDivisions",
			"description": "departmentDivision",
			"version": 1.0,
			"activeFlag": false,
			"type": "USER_DEFINED",
			"tenantId": "pX2e1e12c31",
			"apiHeaders": {
				
			},
			"apiConnectionDefn": null,
			"baseMasterDataDefnId": null,
			"objectDefn": null,
			"fields": {
				"deptDivId": {
					"name": "deptDivId",
					"label": "Association ID",
					"description": "deptDivId",
					"dataTypeDefnId": "TEXT",
					"dataTypeDefn": {
						"dataTypeDefnId": "TEXT",
						"name": "Text",
						"parameterDefns": []
					},
					"dataTypeDefnParameters": {
						
					},
					"sequence": 1.0,
					"searchableFlag": false,
					"deletedFlag": false,
					"primaryKeyFlag": true,
					"uniqueKeyFlag": false,
					"nullableFlag": false,
					"tenantId": "pX2e1e12c31",
					"localizedFlag": false
				},
				"deptId": {
					"name": "deptId",
					"label": "department Id",
					"description": "deptId",
					"dataTypeDefnId": "TEXT",
					"dataTypeDefn": {
						"dataTypeDefnId": "TEXT",
						"name": "Text",
						"parameterDefns": []
					},
					"dataTypeDefnParameters": {
						
					},
					"sequence": 2.0,
					"searchableFlag": false,
					"deletedFlag": false,
					"primaryKeyFlag": false,
					"uniqueKeyFlag": false,
					"nullableFlag": false,
					"tenantId": "pX2e1e12c31",
					"localizedFlag": false
				},
				"divId": {
					"name": "divId",
					"label": "division Id",
					"description": "divId",
					"dataTypeDefnId": "TEXT",
					"dataTypeDefn": {
						"dataTypeDefnId": "TEXT",
						"name": "Text",
						"parameterDefns": []
					},
					"dataTypeDefnParameters": {
						
					},
					"sequence": 3.0,
					"searchableFlag": false,
					"deletedFlag": false,
					"primaryKeyFlag": false,
					"uniqueKeyFlag": false,
					"nullableFlag": false,
					"tenantId": "pX2e1e12c31",
					"localizedFlag": false
				}
			}
		},
		{
			"apiConnectionDefnId": null,
			"apiPath": null,
			"name": "Division",
			"label": "division",
			"description": "division",
			"version": 1.0,
			"activeFlag": false,
			"type": "USER_DEFINED",
			"tenantId": "pX2e1e12c31",
			"apiHeaders": {
				
			},
			"apiConnectionDefn": null,
			"baseMasterDataDefnId": null,
			"objectDefn": null,
			"fields": {
				"divId": {
					"name": "divId",
					"label": "division Id",
					"description": "divId",
					"dataTypeDefnId": "TEXT",
					"dataTypeDefn": {
						"dataTypeDefnId": "TEXT",
						"name": "Text",
						"parameterDefns": []
					},
					"dataTypeDefnParameters": {
						
					},
					"sequence": 1.0,
					"searchableFlag": false,
					"deletedFlag": false,
					"primaryKeyFlag": true,
					"uniqueKeyFlag": false,
					"nullableFlag": false,
					"tenantId": "pX2e1e12c31",
					"localizedFlag": false
				},
				"name": {
					"name": "name",
					"label": "name",
					"description": "name",
					"dataTypeDefnId": "TEXT",
					"dataTypeDefn": {
						"dataTypeDefnId": "TEXT",
						"name": "Text",
						"parameterDefns": []
					},
					"dataTypeDefnParameters": {
						
					},
					"sequence": 2.0,
					"searchableFlag": false,
					"deletedFlag": false,
					"primaryKeyFlag": false,
					"uniqueKeyFlag": false,
					"nullableFlag": false,
					"tenantId": "pX2e1e12c31",
					"localizedFlag": false
				},
				"deptId": {
					"name": "deptId",
					"label": "Department ID ",
					"description": "Department Id",
					"dataTypeDefnId": "TEXT",
					"dataTypeDefn": {
						"dataTypeDefnId": "TEXT",
						"name": "Text",
						"parameterDefns": []
					},
					"dataTypeDefnParameters": {
						
					},
					"sequence": 3.0,
					"searchableFlag": false,
					"deletedFlag": false,
					"primaryKeyFlag": false,
					"uniqueKeyFlag": false,
					"nullableFlag": false,
					"tenantId": "pX2e1e12c31",
					"localizedFlag": false
				}
			}
		}
	],
	"messages": []
}'
