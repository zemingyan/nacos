# nacos

nacos 服务搭建最好用docker

以下是大佬写的docker  nacos 搭建教程　 https://github.com/nacos-group/nacos-docker     直接在本地安装doker docker-compose 然后 git clone下来按照教程跑起来就可以了

nacos需要依赖mysql持久化数据，该docker下将mysql的端口映射成宿主的3306端口。最好是将该docker nacos跑在独立的小主机上，不用去修改映射，也不用去关闭本地mysql服务(个人用户)。　　当然了，如果是在公司工作了，根本不需要本地数据库，直接连公司开发环境下的数据，更加方便。


