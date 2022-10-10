<template>
  <div class="container">
    <select class="form-select">
      <option v-for="item in articleCartegory" :key="item.id" value="{{ item.id }}">{{ item.title }}</option>
    </select>
    <table class="table">
      <tr>
        그리드
      </tr>
    </table>
    <!-- <grid
      :data="gridProps.data"
      :columns="gridProps.columns"
      @click="onClick"
    ></grid> -->
  </div>
</template>
<script>
// import 'tui-grid/dist/tui-grid.css'
// import { Grid } from '@toast-ui/vue-grid'
import request from '@/utils/http-request'

export default {
  components: {
    // grid: Grid
  },
  data() {
    return {
      articleCartegory: [],
      articles: []
    }
  },
  created() {
    console.log('getArticleCartegory:')
    const ret = this.getArticleCartegory()
    this.articleCartegory = ret
    console.log(ret.PromiseResult)
    console.log(this.articleCartegory)
  },
  methods: {
    async getArticleCartegory() {
      return await request({
        url: '/Board/all',
        // param: query,
        method: 'get'
      })
    },
    onClick(ev) {
      console.log('click event: ', ev)
    }
  }
}
</script>
