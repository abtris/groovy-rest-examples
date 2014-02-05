# Groovy REST examples

- http://groovy.codehaus.org/modules/http-builder/doc/rest.html
- [API documentation](http://docs.restapi3.apiary.io) at [Apiary](http://apiary.io)

## Install groovy

    brew install groovy    

Add `GROOVY_HOME` to .bashrc, .zshrc

    export GROOVY_HOME=/usr/local/opt/groovy/libexec

## Install dependency (optional)

    grape install org.codehaus.groovy.modules.http-builder http-builder 

## Content Type in Groovy

In examples using static variable [contentType](http://groovy.codehaus.org/modules/http-builder/apidocs/groovyx/net/http/ContentType.html) with value [JSON](http://groovy.codehaus.org/modules/http-builder/apidocs/groovyx/net/http/ContentType.html#JSON).


## Get examples

    $ groovy get.groovy

    Status: 200
    Content Type: application/json
    Body:
    [
        {
            "id": 1,
            "title": "Jogging in park"
        },
        {
            "id": 2,
            "title": "Pick-up posters from post-office"
        }
    ]