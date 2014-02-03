import groovyx.net.http.RESTClient
import static groovyx.net.http.ContentType.JSON

url = "http://restapi3.apiary.io"

@Grab (group = 'org.codehaus.groovy.modules.http-builder', module = 'http-builder', version = '0.5.0')
def client = new RESTClient(url)

def response = client.put(path: "/notes/id", 
  contentType: JSON,
  body: [ title: "Pick-up posters from Post-Office"],
  headers: [Accept: 'application/json'])

println("Status:" + response.status)
println("Body:" + response.data)
