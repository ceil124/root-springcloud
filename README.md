## build
1. 使用java -jar命令启动eureka-server。
2. 修改springcloud-consumer、springcloud-provider项目application.yaml配置文件的defaultZone参数。
3. 执行各子模块build目录下的build.sh
4. 在集群中执行各子模块yaml/deploy.yaml脚本

# Quick Start
```
http://x.x.x.x:31001/hi
```