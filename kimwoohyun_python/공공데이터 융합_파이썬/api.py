import urllib.request
client_id="pk2wRnMvRMa_WorP5uO1"
cliend_secret="cd0xm_FO6t"
encText=urllib.parse.quote("김치")
url="https://openapi.naver.com/v1/search/blog?query="+encText

request=urllib.request.Request(url)
request.add_header("X-Naver-Client-Id",client_id)
request.add_header("X-Naver-Client-Secret",cliend_secret)
response=urllib.request.urlopen(request)
rescode=response.getcode()
if(rescode==200):
    response_body=response.read()
    print(response_body.decode('utf-8'))
else:
    print("Error Code:"+rescode)