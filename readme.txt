Quick setup — if you’ve done this kind of thing before
or	
HTTPS
SSH

https://github.com/freetonat/javaTest.git
Get started by creating a new file or uploading an existing file. We recommend every repository include a README, LICENSE, and .gitignore.

…or create a new repository on the command line
echo "# javaTest" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/freetonat/javaTest.git
git push -u origin master
…or push an existing repository from the command line
git remote add origin https://github.com/freetonat/javaTest.git
git push -u origin master
…or import code from another repository
You can initialize this repository with code from a Subversion, Mercurial, or TFS project.

//////////
YongtaeSonui-iMac:eclipse-workspace yongtaeson$ git remote set-url origin https://freetonat@github.com/freetonat/javaTest.git
YongtaeSonui-iMac:eclipse-workspace yongtaeson$ git push -u origin master
//////////

git the requested URL returend error : 403 해결방법
git the requested URL returend error : 403 해결방법 은 생각보다 간단합니다. 먼저 이러한 에러가 발생하는 때는 소스코드를 푸쉬할 때 발생합니다. 깃헙에 코드를 푸쉬할 때 해당 주소에 대한 권한이 없기 때문에 403 리턴을 하는 것이지요. 그럼 시작해볼까요?


깃헙에서 New Repository Dev Image

깃헙에서 new repository 를 하게되면 위와 같이 터미널에서 입력을 하라고 가이드가 나옵니다. 차례대로 입력을 하고 git push -u origin master 를 하게되면 403 에러가 발생합니다.


URL returned error : 403 Dev Image

Unable to access 'https://github.com/github_id/git_reposit_name.git'/ The requested URL returned error: 403 의 문구가 나와요. 접근을 못하기에 소스 코드를 푸쉬할 수 없는 상황인거죠. 이것을 해결하는 방법은 인증을 통하면 간단히 해결할 수 있습니다. 


1. 인증하기

=) git remote set-url origin "https://github-username@github.com/github-username/github-repository-name.git" 를 입력해주세요
=) 여기에서 github-username 에는 본인이 github 에서 사용하는 username 을 적으시면 되고 github-repository-name 에는 git reposit 이름을 입력하시면되요. “” 큰따음표는 제거하시구요.
=) 제일 처음에 git remote add origin git_reposit_주소.git 을 통해 origin 명칭을 만들었지만 해당 주소에 대한 권한이 없어서 푸쉬를 할 때 에러가 난거에요.

2. 소스코드 푸쉬하기

=) 터미널에서 git push -u origin master 를 입력합니다
=) 깃헙 패스워드 입력을 하라는 창이 나오고 입력을 하시면 본인의 깃주소에 소스코드가 올라갑니다.
=) 인증이 끝난 후부터는 git push만 하면 기존의 세팅한 주소로 바로 푸쉬가 됩니다. 변경을 원하시면 git remote "set-url" "any_name" "git_reposit_주소"를 사용하시면 되요
