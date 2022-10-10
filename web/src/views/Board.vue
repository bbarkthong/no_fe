<template>
  <div class="container">
    <select class="form-select form-control" @change="onChangeArticleCartegory" v-model="articleCartegorySel">
      <option v-for="item in articleCartegory" :key="item.id" :value="item.id">{{ item.title }}</option>
    </select>
    <table class="table table-success table-striped table-hover">
      <thead>
        <tr>
          <th scope="col">#</th>
          <th scope="col">제목</th>
          <th scope="col">내용</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="item in articles" :key="item.id">
          <td>{{item.id}}</td>
          <td>{{item.title}}</td>
          <td>{{item.content}}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>
<script>
import request from '@/utils/http-request'

export default {
  components: {
    // grid: Grid
  },
  data() {
    return {
      articleCartegory: [],
      articleCartegorySel: null,
      articles: []
    }
  },
  created() {
    this.getArticleCartegory()
  },
  methods: {
    getArticleCartegory() {
      request({
        url: '/Board/all',
        method: 'get'
      }).then(response => {
        this.articleCartegory = response
        if (this.articleCartegorySel == null) {
          this.articleCartegorySel = this.articleCartegory[0].id
        }
      })
    },
    getArticles(boardId) {
      const url = '/Board/' + boardId + '/all'
      request({
        url,
        method: 'get'
      }).then(response => {
        this.articles = response
      })
    },
    onChangeArticleCartegory() {
      this.getArticles(this.articleCartegorySel)
    }
  }
}
</script>
