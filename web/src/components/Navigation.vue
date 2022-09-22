<template>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">Navbar</a>
      <button
        class="navbar-toggler"
        type="button"
        data-bs-toggle="collapse"
        data-bs-target="#navbarSupportedContent"
        aria-controls="navbarSupportedContent"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item" v-for="item in menu" :key="item.menu_id" style="margin: 5px;">
            <router-link class="btn btn-hover"
              v-bind:class="{'btn-success disabled':item.menu_id==selected_menu.id, 'btn-outline-success':item.menu_id!=selected_menu.id}"
              aria-current="page" :to="{path:item.menu_to}">{{ item.menu_nm }}</router-link> |
          </li>
        </ul>
        <div class="d-flex" id="login-info">
          <button class="btn btn-outline-success" v-if="!is_login">
            회원가입
          </button>
          <button class="btn btn-outline-success" v-if="!is_login">
            로그인
          </button>
          <span v-if="is_login" class="navbar-text">사용자:박상훈</span>
        </div>
      </div>
    </div>
  </nav>
</template>

<script>
export default {
  // name: 'Header',
  data() {
    return {
      selected_menu: {
        id: '',
        auth: []
      },
      menu: [],
      is_login: false
    }
  },
  methods: {
  },
  created() {
    this.menu = [{
      menu_id: '1',
      menu_nm: 'Home',
      menu_to: '/'
    },
    {
      menu_id: '2',
      menu_nm: 'About',
      menu_to: '/about'
    },
    {
      menu_id: '3',
      menu_nm: '글목록',
      menu_to: '/board'
    },
    {
      menu_id: '4',
      menu_nm: '글등록',
      menu_to: '/post/register'
    }]

    this.is_login = true
  }
}
</script>
