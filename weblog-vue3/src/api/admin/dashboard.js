import axios from "@/axios";

// 获取仪表盘基础信息（文章数、分类数、标签数、总浏览量）
export function getBaseStatisticsInfo(data) {
    return axios.post("/admin/dashboard/statistics", data)
}
export function getPublishArticleStatisticsInfo(data) {
    return axios.post("/admin/dashboard/publishArticle/statistics", data)
}
export function getArticlePVStatisticsInfo(data) {
    return axios.post("/admin/dashboard/pv/statistics", data)
}