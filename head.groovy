import groovyx.net.http.RESTClient
import static groovyx.net.http.ContentType.JSON

url = "http://restapi3.apiary.io"

@Grab (group = 'org.codehaus.groovy.modules.http-builder', module = 'http-builder', version = '0.5.0')
def client = new RESTClient(url)

def response = client.head(path: "/notes")

println("Status:" + response.status)
