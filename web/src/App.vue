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
        <!-- <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item" v-for="item in menu" style="margin: 5px;">
            <a class="btn btn-hover"
              v-bind:class="{'btn-success disabled':item.menu_id==selected_menu.id, 'btn-outline-success':item.menu_id!=selected_menu.id}"
              aria-current="page" @click="click_menu(item.menu_id)">
              {{ item.menu_nm }}
            </a>
          </li>
        </ul> -->
        <router-link to="/">Home</router-link> |
        <router-link to="/about">About</router-link>
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
  <router-view />
</template>

<script>
export default {
  // name: 'Header',
  data() {
    return {
      selected_menu: {
        id: "",
        auth: [],
      },
      menu: [],
    };
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
