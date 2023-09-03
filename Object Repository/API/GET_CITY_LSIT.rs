<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GET_CITY_LSIT</name>
   <tag></tag>
   <elementGuidId>05b51566-1849-428b-b99d-d11e7718051c</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <katalonVersion>8.6.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${GlobalVariable.BASE_URL}/master/v1/address/city?page=${reqPage}&amp;limit=${reqLimit}&amp;city_code=${reqCityCode}&amp;name=${reqName}&amp;province_code=${reqProvinceCode}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'1'</defaultValue>
      <description></description>
      <id>08fdd884-77f2-48a6-9a54-68f91f049376</id>
      <masked>false</masked>
      <name>reqPage</name>
   </variables>
   <variables>
      <defaultValue>'10'</defaultValue>
      <description></description>
      <id>9cec7bca-4964-4f96-9ba3-a7797a357e13</id>
      <masked>false</masked>
      <name>reqLimit</name>
   </variables>
   <variables>
      <defaultValue>'11.75'</defaultValue>
      <description></description>
      <id>36c0542a-1084-4829-8544-98665bd4add4</id>
      <masked>false</masked>
      <name>reqCityCode</name>
   </variables>
   <variables>
      <defaultValue>'Subulussalam'</defaultValue>
      <description></description>
      <id>285ce412-b4cf-49a2-b044-3287eb8f9233</id>
      <masked>false</masked>
      <name>reqName</name>
   </variables>
   <variables>
      <defaultValue>'11'</defaultValue>
      <description></description>
      <id>2fa0cc2c-6492-4bcf-abf6-6a1eed87e23c</id>
      <masked>false</masked>
      <name>reqProvinceCode</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
