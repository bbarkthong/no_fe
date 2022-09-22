<template>
  <div class="container">
    그리드
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

export default {
  components: {
    // grid: Grid
  },
  created() {
    this.gridProps = {
      data: [
        // for rowData prop
        {
          name: 'Beautiful Lies',
          artist: 'Birdy'
        },
        {
          name: 'X',
          artist: 'Ed Sheeran'
        }
      ],
      columns: [
        // for columnData prop
        {
          header: 'Name',
          name: 'name'
        },
        {
          header: 'Artist',
          name: 'artist'
        }
      ]
    }
  },
  methods: {
    onClick(ev) {
      console.log('click event: ', ev)
    }
  }
}
</script>
