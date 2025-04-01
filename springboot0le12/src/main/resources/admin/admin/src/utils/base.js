const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot0le12/",
            name: "springboot0le12",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot0le12/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "私人西服定制"
        } 
    }
}
export default base
