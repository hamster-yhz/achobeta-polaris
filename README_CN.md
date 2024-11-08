# AchoBeta Polaris 北极星系统-2024年-J组-复试项目

AchoBeta Polaris 北极星系统-2024年-J组-复试项目

# 开发之前

1. 请在根目录执行下面的命令

```shell
git config core.hooksPath .githooks 
chmod -R -x .githooks 
```

+ 上述命令的目的是在 git 提交时触发钩子以确认提交消息格式是否正确。

2. **请阅读下面的开发规范**

# 分支命名约定
必须确保:

1. 分支名应当携带上开发者名称以便标识

2. 分支名必须清楚的表述该分支解决了什么问题

分支命名必须标准化, 参照该格式进行分支命名
```bash
<type>-<name>-<description>
```
举个例子:
- 如果它是开发新功能的分支，则命名约定如下
```bash
feature-<name>-<feature description>
e.g.: feature-jett-dev_log_system
```

- 如果他是为了修复 bug 而开辟的分支:
```bash
bugfix-<name>-<bug name>
e.g.: bugfix-jett-login_error
```
其他分支功能类型如下:
`hotfix`、`release`...


# 提交信息规范
提交信息应尽可能清晰，且每个提交只实现一个小功能以达到细粒度。

```bash
<type>(<scope>): <subject>

e.g.: feat: add new api
or: feat(common): add new api
```

## type

```text
# 主要type
feat:     增加新功能
fix:      修复 bug

# 特殊type
docs:     只改动了文档相关的内容
style:    不影响代码含义的改动，例如去掉空格、改变缩进、增删分号
build:    构造工具的或者外部依赖的改动，例如 webpack，npm
refactor: 代码重构时使用
revert:   执行 git revert 打印的 message

# 暂不使用type
test:     添加测试或者修改现有测试
perf:     提高性能的改动
ci:       与 CI（持续集成服务）有关的改动
chore:    不修改 src 或者 test 的其余修改，例如构建过程或辅助工具的变动
```

## subject

一个句子结尾请不要使用任何标点符号修饰

e.g.
```bash
feat: add new feature
fix: fix a bug
```

## 提交内容
无用 import 请删除，快捷键 ctrl + alt + o 也可以通过设置 idea 自动删除无用 import

## 你必须知道
1. 不要提交任何敏感信息，例如 api_key、address 或 password。

2. application-dev.yml、application-prod.yml 最新配置请团队内部保管，不要上传到 git，任何方式都不被允许，因为 git 一旦提交，记录永久存在

3. 任何时候不要用 git push --force 除非你知道你在干什么。