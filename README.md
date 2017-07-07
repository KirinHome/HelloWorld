# HelloWorld  ![:kiss:][lips]

## 目录
* [Introduction](#简要说明)
* [Life](#漫漫人生路)
* [About me](#about-me)
* [Copyright and License](#copyright-and-license)


## 简要说明
[本项目主要文件的目录树][CSDN]
```
├─ b.properties
├─ CSDN.jsp
├─ HelloWorld.iml
├─ lib
│ 	├─ aspectjrt-1.7.4.jar
│ 	├─ aspectjweaver-1.7.4.jar
│ 	├─ cglib-nodep-2.1_3.jar
│ 	├─ common-annotations.jar
│ 	├─ commons-collections-3.1.jar
│ 	├─ commons-dbcp.jar
│ 	├─ commons-logging.jar
│ 	├─ commons-pool.jar
│ 	├─ dom4j-1.6.1.jar
│ 	├─ fastjson-1.2.21.jar
│ 	├─ guava-19.0.jar
│ 	├─ hamcrest-core-1.3.jar
│ 	├─ hibernate3.jar
│ 	├─ intellijIDEA-settings-20170328.jar
│ 	├─ javassist-3.9.0.GA.jar
│ 	├─ jta-1.1.jar
│ 	├─ junit-4.12.jar
│ 	├─ log4j-1.2.15.jar
│ 	├─ mysql-connector-java-5.1.10-bin.jar
│ 	├─ poi-3.11.jar
│ 	├─ sigar-1.6.4.jar
│ 	├─ sigar-1.6.5.132.jar
│ 	├─ slf4j-api-1.7.5-sources.jar
│ 	├─ slf4j-api-1.7.5.jar
│ 	├─ slf4j-log4j12.jar
│ 	├─ spring-beans-4.1.4.RELEASE.jar
│ 	└─ spring.jar
├─ log.properties
├─ log4j.xml
├─ logs
├─ order.properties
├─ pom.xml
├─ README.md
├─ readMeExample
│ 	├─ Book
│ 	│ 	└─ profile.md
│ 	├─ emoji.md
│ 	├─ example
│ 	│ 	└─ profile.md
│ 	├─ img
│ 	│ 	├─ csdn.png
│ 	│ 	├─ weibo.png
│ 	│ 	└─ zhihu.png
│ 	└─ README.md
├─ src
│ 	├─ com
│ 	│ 	└─ lxk
│ 	│ 		├─ aop
│ 	│ 		│ 	├─ Logger.java
│ 	│ 		│ 	├─ MainTest.java
│ 	│ 		│ 	├─ Privilege.java
│ 	│ 		│ 	├─ SalaryService.java
│ 	│ 		│ 	├─ SalaryServiceImpl.java
│ 	│ 		│ 	├─ SalaryServiceProxy.java
│ 	│ 		│ 	└─ Security.java
│ 	│ 		├─ atInterfaceTest
│ 	│ 		│ 	└─ AtInterfaceTest.java
│ 	│ 		├─ classInitTest
│ 	│ 		│ 	├─ Child.java
│ 	│ 		│ 	├─ ClassInitTest.java
│ 	│ 		│ 	└─ Parent.java
│ 	│ 		├─ collectionTest
│ 	│ 		│ 	├─ ArrayListTest.java
│ 	│ 		│ 	├─ EmptyList.java
│ 	│ 		│ 	├─ EmptyTest.java
│ 	│ 		│ 	├─ GetDifferenceSet.java
│ 	│ 		│ 	├─ HashMapTest.java
│ 	│ 		│ 	├─ ListToString.java
│ 	│ 		│ 	├─ MyHashMap.java
│ 	│ 		│ 	└─ OrderedMapTest.java
│ 	│ 		├─ commonTest
│ 	│ 		│ 	├─ ArraysTest.java
│ 	│ 		│ 	├─ CloneTest.java
│ 	│ 		│ 	├─ EnumTest.java
│ 	│ 		│ 	├─ ForTest.java
│ 	│ 		│ 	├─ IntegerTest.java
│ 	│ 		│ 	├─ StringTest.java
│ 	│ 		│ 	├─ SwitchCaseTest.java
│ 	│ 		│ 	├─ TimeTest.java
│ 	│ 		│ 	├─ TryCatchFinallyTest.java
│ 	│ 		│ 	└─ TTest.java
│ 	│ 		├─ concurrentModificationExceptionTest
│ 	│ 		│ 	└─ ConcurrentModificationExceptionTest.java
│ 	│ 		├─ designPattern
│ 	│ 		│ 	├─ decorator
│ 	│ 		│ 	│ 	├─ Person.java
│ 	│ 		│ 	│ 	├─ PersonBefore.java
│ 	│ 		│ 	│ 	├─ PersonDemo.java
│ 	│ 		│ 	│ 	└─ PersonNow.java
│ 	│ 		│ 	├─ factory
│ 	│ 		│ 	├─ proxy
│ 	│ 		│ 	│ 	├─ dynamicProxy
│ 	│ 		│ 	│ 	│ 	├─ cglbDynamicProxy
│ 	│ 		│ 	│ 	│ 	│ 	├─ MainTest.java
│ 	│ 		│ 	│ 	│ 	│ 	├─ MyInterceptor.java
│ 	│ 		│ 	│ 	│ 	│ 	└─ TargetObject.java
│ 	│ 		│ 	│ 	│ 	└─ jdkDynamicProxy
│ 	│ 		│ 	│ 	│ 		├─ MainTest.java
│ 	│ 		│ 	│ 	│ 		├─ MyInterceptor.java
│ 	│ 		│ 	│ 	│ 		├─ TargetInterface.java
│ 	│ 		│ 	│ 	│ 		└─ TargetObject.java
│ 	│ 		│ 	│ 	└─ staticProxy
│ 	│ 		│ 	│ 		├─ MainTest.java
│ 	│ 		│ 	│ 		├─ ProxyObject.java
│ 	│ 		│ 	│ 		├─ TargetInterface.java
│ 	│ 		│ 	│ 		└─ TargetObject.java
│ 	│ 		│ 	└─ singleton
│ 	│ 		│ 		├─ Main.java
│ 	│ 		│ 		├─ SingletonPattern1.java
│ 	│ 		│ 		├─ SingletonPattern2.java
│ 	│ 		│ 		└─ SingletonPattern3.java
│ 	│ 		├─ extendTest
│ 	│ 		│ 	├─ Child.java
│ 	│ 		│ 	├─ ExtendTestMain.java
│ 	│ 		│ 	└─ Parent.java
│ 	│ 		├─ fileTest
│ 	│ 		│ 	├─ byteFile
│ 	│ 		│ 	├─ characterFile
│ 	│ 		│ 	│ 	├─ BufferedReaderDemo.java
│ 	│ 		│ 	│ 	├─ BufferedWriterDemo.java
│ 	│ 		│ 	│ 	├─ CopyText.java
│ 	│ 		│ 	│ 	├─ CopyTextByBuf.java
│ 	│ 		│ 	│ 	├─ FileReaderDemo.java
│ 	│ 		│ 	│ 	├─ FileReaderDemo2.java
│ 	│ 		│ 	│ 	├─ FileReaderTest.java
│ 	│ 		│ 	│ 	├─ FileWriterDemo.java
│ 	│ 		│ 	│ 	├─ FileWriterDemo2.java
│ 	│ 		│ 	│ 	├─ FileWriterDemo3.java
│ 	│ 		│ 	│ 	└─ WtiterTest.java
│ 	│ 		│ 	├─ FileTest.java
│ 	│ 		│ 	├─ poiTest
│ 	│ 		│ 	│ 	└─ PoiTest.java
│ 	│ 		│ 	├─ propertyFileTest
│ 	│ 		│ 	│ 	├─ config.properties
│ 	│ 		│ 	│ 	├─ Main.java
│ 	│ 		│ 	│ 	├─ MainOrder.java
│ 	│ 		│ 	│ 	└─ OrderedProperties.java
│ 	│ 		│ 	└─ xmlTest
│ 	│ 		│ 		├─ XmlModel.java
│ 	│ 		│ 		└─ XmlTest.java
│ 	│ 		├─ findBugs
│ 	│ 		│ 	├─ Bug1.java
│ 	│ 		│ 	└─ Bug2.java
│ 	│ 		├─ formatTest
│ 	│ 		│ 	├─ DateFormat.java
│ 	│ 		│ 	└─ NumberFormatTest.java
│ 	│ 		├─ guavaTest
│ 	│ 		│ 	├─ ConstantMap.java
│ 	│ 		│ 	├─ ImmutableMapTest.java
│ 	│ 		│ 	├─ ListsTest.java
│ 	│ 		│ 	├─ MapsTest.java
│ 	│ 		│ 	├─ SetsTest.java
│ 	│ 		│ 	└─ StringToolsTest.java
│ 	│ 		├─ javaDocTest
│ 	│ 		│ 	└─ JavaDocTest.java
│ 	│ 		├─ json
│ 	│ 		│ 	└─ JsonTest.java
│ 	│ 		├─ log
│ 	│ 		│ 	└─ LogMain.java
│ 	│ 		├─ lombok
│ 	│ 		├─ model
│ 	│ 		│ 	├─ Car.java
│ 	│ 		│ 	├─ CEO.java
│ 	│ 		│ 	├─ CodeBlockModel.java
│ 	│ 		│ 	├─ Dog.java
│ 	│ 		│ 	├─ Employee.java
│ 	│ 		│ 	├─ enumModel
│ 	│ 		│ 	│ 	├─ GameEnum.java
│ 	│ 		│ 	│ 	├─ SeasonEnum.java
│ 	│ 		│ 	│ 	└─ TypeEnum.java
│ 	│ 		│ 	├─ Manager.java
│ 	│ 		│ 	├─ MultiObject.java
│ 	│ 		│ 	├─ PersonByAge.java
│ 	│ 		│ 	├─ PersonByName.java
│ 	│ 		│ 	├─ Person_.java
│ 	│ 		│ 	├─ Point.java
│ 	│ 		│ 	├─ Student.java
│ 	│ 		│ 	└─ TimeFormatModel.java
│ 	│ 		├─ mongo
│ 	│ 		│ 	└─ mongoJavaDriver
│ 	│ 		├─ programQuestions
│ 	│ 		│ 	├─ CountEggs.java
│ 	│ 		│ 	├─ CountNumberOf1.java
│ 	│ 		│ 	├─ FindTheNumber.java
│ 	│ 		│ 	├─ FindTheSpecialNumber.java
│ 	│ 		│ 	├─ PrimeNumberTest.java
│ 	│ 		│ 	├─ PrintSnakeMatrixTest.java
│ 	│ 		│ 	└─ Questions.java
│ 	│ 		├─ reflect
│ 	│ 		│ 	├─ ClassloaderAndForNameTest.java
│ 	│ 		│ 	├─ CodeBlockTest.java
│ 	│ 		│ 	├─ Line.java
│ 	│ 		│ 	└─ Point.java
│ 	│ 		├─ sigar
│ 	│ 		│ 	├─ SigarInfoEntity.java
│ 	│ 		│ 	├─ SigarMain.java
│ 	│ 		│ 	└─ SigarUtils.java
│ 	│ 		├─ spring
│ 	│ 		│ 	├─ aop
│ 	│ 		│ 	│ 	├─ annotation
│ 	│ 		│ 	│ 	│ 	├─ AOPAnnotationTest.java
│ 	│ 		│ 	│ 	│ 	├─ applicationContext.xml
│ 	│ 		│ 	│ 	│ 	├─ Person.java
│ 	│ 		│ 	│ 	│ 	├─ PersonDao.java
│ 	│ 		│ 	│ 	│ 	├─ PersonDaoImpl.java
│ 	│ 		│ 	│ 	│ 	└─ Transaction.java
│ 	│ 		│ 	│ 	└─ xml
│ 	│ 		│ 	│ 		├─ AOPXMLTest.java
│ 	│ 		│ 	│ 		├─ applicationContext.xml
│ 	│ 		│ 	│ 		├─ applicationContext1.xml
│ 	│ 		│ 	│ 		├─ Logger.java
│ 	│ 		│ 	│ 		├─ Person.java
│ 	│ 		│ 	│ 		├─ PersonDao.java
│ 	│ 		│ 	│ 		├─ PersonDaoImpl.java
│ 	│ 		│ 	│ 		└─ Transaction.java
│ 	│ 		│ 	├─ config
│ 	│ 		│ 	│ 	├─ applicationContext.xml
│ 	│ 		│ 	│ 	├─ BigBrother.java
│ 	│ 		│ 	│ 	├─ config.properties
│ 	│ 		│ 	│ 	└─ MainTest.java
│ 	│ 		│ 	├─ ioc
│ 	│ 		│ 	│ 	├─ applicationContext.xml
│ 	│ 		│ 	│ 	├─ Axe.java
│ 	│ 		│ 	│ 	├─ Chinese.java
│ 	│ 		│ 	│ 	├─ Main.java
│ 	│ 		│ 	│ 	├─ Person.java
│ 	│ 		│ 	│ 	├─ SteelAxe.java
│ 	│ 		│ 	│ 	└─ StoneAxe.java
│ 	│ 		│ 	├─ jdbc
│ 	│ 		│ 	│ 	├─ applicationContext.xml
│ 	│ 		│ 	│ 	├─ DataSourceTest.java
│ 	│ 		│ 	│ 	├─ jdbc.properties
│ 	│ 		│ 	│ 	├─ Person.java
│ 	│ 		│ 	│ 	├─ PersonDao.java
│ 	│ 		│ 	│ 	├─ PersonDaoImpl.java
│ 	│ 		│ 	│ 	├─ PersonDaoTest.java
│ 	│ 		│ 	│ 	└─ PersonRowMapper.java
│ 	│ 		│ 	└─ transaction
│ 	│ 		│ 		└─ xml
│ 	│ 		│ 			├─ applicationContext.xml
│ 	│ 		│ 			├─ jdbc.properties
│ 	│ 		│ 			├─ PersonDao.java
│ 	│ 		│ 			├─ PersonDaoImpl.java
│ 	│ 		│ 			├─ PersonService.java
│ 	│ 		│ 			├─ PersonServiceImpl.java
│ 	│ 		│ 			└─ PersonTest.java
│ 	│ 		├─ systemTest
│ 	│ 		│ 	└─ SystemDemo.java
│ 	│ 		├─ test
│ 	│ 		│ 	├─ CompareObject.java
│ 	│ 		│ 	├─ DiskTool.java
│ 	│ 		│ 	└─ NoGroupTest.java
│ 	│ 		├─ threadTest
│ 	│ 		│ 	├─ bank
│ 	│ 		│ 	│ 	├─ Bank.java
│ 	│ 		│ 	│ 	├─ Customer.java
│ 	│ 		│ 	│ 	└─ Main.java
│ 	│ 		│ 	├─ callable
│ 	│ 		│ 	│ 	├─ Main.java
│ 	│ 		│ 	│ 	└─ MyCallable.java
│ 	│ 		│ 	├─ deadLoack
│ 	│ 		│ 	│ 	├─ DeadLockTest.java
│ 	│ 		│ 	│ 	├─ Main.java
│ 	│ 		│ 	│ 	└─ Ticket.java
│ 	│ 		│ 	├─ ListPerformance.java
│ 	│ 		│ 	├─ multithreadCommunication
│ 	│ 		│ 	│ 	├─ inOutDemo
│ 	│ 		│ 	│ 	│ 	├─ bad
│ 	│ 		│ 	│ 	│ 	│ 	├─ Input.java
│ 	│ 		│ 	│ 	│ 	│ 	├─ Main.java
│ 	│ 		│ 	│ 	│ 	│ 	├─ Output.java
│ 	│ 		│ 	│ 	│ 	│ 	└─ Resources.java
│ 	│ 		│ 	│ 	│ 	└─ good
│ 	│ 		│ 	│ 	│ 		├─ Input.java
│ 	│ 		│ 	│ 	│ 		├─ Main.java
│ 	│ 		│ 	│ 	│ 		├─ Output.java
│ 	│ 		│ 	│ 	│ 		└─ Resources.java
│ 	│ 		│ 	│ 	└─ producerConsumer
│ 	│ 		│ 	│ 		├─ bad
│ 	│ 		│ 	│ 		│ 	├─ Consumer.java
│ 	│ 		│ 	│ 		│ 	├─ Main.java
│ 	│ 		│ 	│ 		│ 	├─ Producer.java
│ 	│ 		│ 	│ 		│ 	└─ Resource.java
│ 	│ 		│ 	│ 		└─ good
│ 	│ 		│ 	│ 			├─ Consumer.java
│ 	│ 		│ 	│ 			├─ Main.java
│ 	│ 		│ 	│ 			├─ Producer.java
│ 	│ 		│ 	│ 			└─ Resource.java
│ 	│ 		│ 	├─ ticket
│ 	│ 		│ 	│ 	├─ extend
│ 	│ 		│ 	│ 	│ 	├─ Main.java
│ 	│ 		│ 	│ 	│ 	└─ Ticket.java
│ 	│ 		│ 	│ 	└─ implement
│ 	│ 		│ 	│ 		├─ Main.java
│ 	│ 		│ 	│ 		├─ Ticket.java
│ 	│ 		│ 	│ 		└─ TicketStatic.java
│ 	│ 		│ 	└─ wayToThread
│ 	│ 		│ 		├─ Main.java
│ 	│ 		│ 		├─ ThreadWay1.java
│ 	│ 		│ 		├─ ThreadWay2.java
│ 	│ 		│ 		└─ ThreadWay3.java
│ 	│ 		├─ tool
│ 	│ 		│ 	└─ DirectoryTreeV1.java
│ 	│ 		└─ util
│ 	│ 			├─ FileIOUtil.java
│ 	│ 			├─ JsonUtils.java
│ 	│ 			└─ TimesUtils.java
│ 	└─ testConfig.xml
└─ sss.xml
```


## 漫漫人生路
![begin][start] ![going on][going on] ![going on][going on more]

## About Me
- QQ：[1181415316][CSDN_]
- Email：  [cmshome@163.com][Email]
- GitHub： [Please Call Me Big Brother.][Github]
- CSDN：   [请叫我大师兄][CSDN]

## Copyright and License
**The MIT License (MIT)**


[Email]:mailto:cmshome@163.com "我的邮箱"
[Github]:https://github.com/cmshome "我的GitHub"
[CSDN]:http://blog.csdn.net/qq_27093465?viewmode=contents "我的CSDN"
[CSDN_]:http://blog.csdn.net/qq_27093465?viewmode=contents "我的qq号"
[start]:http://forum.csdn.net/PointForum/ui/scripts/csdn/Plugin/003/onion/41.gif "刚刚毕业，好好学习。"
[going on]:http://forum.csdn.net/PointForum/ui/scripts/csdn/Plugin/003/onion/83.gif "渐入佳境，高调装逼。"
[going on more]:http://forum.csdn.net/PointForum/ui/scripts/csdn/Plugin/003/onion/2.gif "最高境界，低调低调。"
[lips]:https://github.com/jsw0528/rails_emoji/raw/master/vendor/assets/images/emojis/kiss.png "烈焰红唇"
