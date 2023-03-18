[
  {
    "ProfileName": "CORS Misconfiguration - ACAC enabled",
    "Name": "",
    "Enabled": true,
    "Scanner": 2,
    "Author": "@MrW0l05zyn",
    "Payloads": [],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,Access-Control-Allow-Credentials: true"
    ],
    "Tags": [
      "All",
      "CORS"
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
    "isHeaderValue": false,
    "sequence": false,
    "NewHeaders": [],
    "MatchType": 1,
    "Scope": 2,
    "RedirType": 0,
    "MaxRedir": 0,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 0,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "CORS Misconfiguration - ACAC enabled",
    "IssueSeverity": "Information",
    "IssueConfidence": "Certain",
    "IssueDetail": "El encabezado HTTP \u003cstrong\u003eAccess-Control-Allow-Credentials\u003c/strong\u003e le dice al navegador si exponer la respuesta al código JavaScript (del front-end) cuando el \u003ci\u003emodo credenciales\u003c/i\u003e en la petición es incluido.\n\u003cbr /\u003e\u003cbr /\u003e  \n\u003ccode\u003e\nAccess-Control-Allow-Credentials: true\n\u003c/code\u003e\n\u003cbr /\u003e\u003cbr /\u003e\nReferencias: \n\u003cul\u003e\n\u003cli\u003e\u003ca href\u003d\"https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Credentials\"\u003eMDN Web Docs\u003c/a\u003e\u003c/li\u003e\n\u003cli\u003e\u003ca href\u003d\"https://owasp.org/www-project-web-security-testing-guide/v41/4-Web_Application_Security_Testing/11-Client_Side_Testing/07-Testing_Cross_Origin_Resource_Sharing\"\u003eOWASP Web Security Testing Guide (WSTG)\u003c/a\u003e\u003c/li\u003e  \n\u003cli\u003e\u003ca href\u003d\"https://portswigger.net/web-security/cors\"\u003ePortSwigger\u003c/a\u003e\u003c/li\u003e\n\u003c/ul\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 0
  }
]