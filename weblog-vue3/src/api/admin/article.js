import axios from "@/axios";


//获取文章分页数据
export function getArticlePageList(data){
    return axios.post("/admin/article/list",data)
}
//删除文章数据
export function deleteArticle(id){
    return axios.post("admin/article/delete",{id})
}
// 获取分类 select 数据
export function getCategorySelectList() {
    return axios.post("/admin/category/select/list")
}
export function publishArticle(data) {
    return axios.post("/admin/article/publish", data)
}
export function getArticleDetail(id) {
    return axios.post("/admin/article/detail", {id})
}
// 更新文章
export function updateArticle(data) {
    return axios.post("/admin/article/update", data)
}
