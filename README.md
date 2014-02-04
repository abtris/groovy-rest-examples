# Groovy REST examples

http://groovy.codehaus.org/modules/http-builder/doc/rest.html

## Install groovy

    brew install groovy    

Add `GROOVY_HOME` to .bashrc, .zshrc

    export GROOVY_HOME=/usr/local/opt/groovy/libexec

## Install dependency (optional)

    grape install org.codehaus.groovy.modules.http-builder http-builder 

## Content Type in Groovy

In examples using static variable [contentType](http://groovy.codehaus.org/modules/http-builder/apidocs/groovyx/net/http/ContentType.html) with value [JSON](http://groovy.codehaus.org/modules/http-builder/apidocs/groovyx/net/http/ContentType.html#JSON).

