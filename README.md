# Mall
功能完善的在线商城（前端正在开发中）  
服务端功能已经完成，可以使用Chrome插件Restlet Client进行测试。
使用准备：  
1、在datasource.properties中配置数据库信息；  
2、在logback.xml中配置log文件存储位置；  
3、在zfbinfo.properties中配置支付宝沙箱环境信息，具体可参看“蚂蚁金服开放平台”；  
4、在mmall.properties中配置FTP服务器信息（Windows可使用FTPServer），alipay.callback.url配置使用了  
Natapp（可参看natapp官网）来进行内外网穿透，方便在本地调试代码时使用支付宝沙箱环境模拟支付过程。