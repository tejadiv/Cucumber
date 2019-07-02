$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/sample5.feature");
formatter.feature({
  "name": "search multiple item",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "search for products",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user searches for the products",
  "rows": [
    {
      "cells": [
        "iphone"
      ]
    },
    {
      "cells": [
        "headphone"
      ]
    },
    {
      "cells": [
        "washing machine"
      ]
    },
    {
      "cells": [
        "iron box"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "sample5.user_searches_for_the_products(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the products",
  "keyword": "And "
});
formatter.match({
  "location": "sample5.verify_the_products()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close app",
  "keyword": "Then "
});
formatter.match({
  "location": "sample5.close_app()"
});
formatter.result({
  "status": "passed"
});
});