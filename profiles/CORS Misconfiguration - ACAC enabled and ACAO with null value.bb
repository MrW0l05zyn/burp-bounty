[
  {
    "ProfileName": "CORS Misconfiguration - ACAC enabled and ACAO with null value",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@MrW0l05zyn",
    "Payloads": [
      "true,null"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,(Access-Control-Allow-Origin:(\\s)*null(.|\\r|\\n)*Access-Control-Allow-Credentials:(\\s)*true)|(Access-Control-Allow-Credentials:(\\s)*true(.|\\r|\\n)*Access-Control-Allow-Origin:(\\s)*null)"
    ],
    "Tags": [
      "All",
      "MrW0l05zyn",
      "MrW0l05zyn - CORS"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": false,
    "OnlyHTTP": true,
    "IsContentType": false,
    "ContentType": "",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "isHeaderValue": true,
    "sequence": false,
    "NewHeaders": [
      "Origin"
    ],
    "MatchType": 2,
    "Scope": 0,
    "RedirType": 0,
    "MaxRedir": 0,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "CORS Misconfiguration - ACAC enabled and ACAO with null value",
    "IssueSeverity": "Low",
    "IssueConfidence": "Certain",
    "IssueDetail": "\u003cbr /\u003e\nEl valor del encabezado HTTP \u003cstrong\u003eAccess-Control-Allow-Origin\u003c/strong\u003e permite el valor nulo (\u003cstrong\u003enull\u003c/strong\u003e). Algunas aplicaciones pueden incluir en su lista blanca el valor nulo (\u003cstrong\u003enull\u003c/strong\u003e) para admitir el desarrollo local de su aplicación. En esta situación, un atacante puede generar una solicitud que contenga el valor nulo (\u003cstrong\u003enull\u003c/strong\u003e) en el encabezado \u003cstrong\u003eOrigin\u003c/strong\u003e y esto satisfará la lista blanca de \u003cstrong\u003eAccess-Control-Allow-Origin\u003c/strong\u003e haciendo que el navegador exponga la respuesta al código JavaScript (del front-end).\n\u003cbr /\u003e\u003cbr /\u003e  \n\u003ccode\u003e\nAccess-Control-Allow-Origin: null\n\u003cbr/\u003e\nAccess-Control-Allow-Credentials: true\n\u003c/code\u003e\n\u003cbr /\u003e\u003cbr /\u003e\nReferencias: \n\u003cul\u003e\n\u003cli\u003e\u003ca href\u003d\"https://owasp.org/www-project-web-security-testing-guide/v41/4-Web_Application_Security_Testing/11-Client_Side_Testing/07-Testing_Cross_Origin_Resource_Sharing\"\u003eOWASP Web Security Testing Guide (WSTG)\u003c/a\u003e\u003c/li\u003e  \n\u003cli\u003e\u003ca href\u003d\"https://portswigger.net/web-security/cors\"\u003ePortSwigger\u003c/a\u003e\u003c/li\u003e\n\u003c/ul\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      78
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 1
  }
]