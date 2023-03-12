[
  {
    "ProfileName": "CORS Misconfiguration - ACAC enabled and ACAO with null value",
    "Name": "",
    "Enabled": false,
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
    "IssueDetail": "\u003cbr/\u003e\nAccess-Control-Allow-Origin: null\u003cbr/\u003e\nAccess-Control-Allow-Credentials: true",
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