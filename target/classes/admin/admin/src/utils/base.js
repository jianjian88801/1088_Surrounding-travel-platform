const base = {
    get() {
        return {
            url : "http://localhost:8080/zhoubianyoupingtai/",
            name: "zhoubianyoupingtai",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zhoubianyoupingtai/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "周边游平台"
        } 
    }
}
export default base
