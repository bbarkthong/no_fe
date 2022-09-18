<template>
    <div class="container" id="container">
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Navbar</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                    aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item" v-for="item in menu" style="margin: 5px;">
                            <a class="btn btn-hover"
                                v-bind:class="{'btn-success disabled':item.menu_id==selected_menu.id, 'btn-outline-success':item.menu_id!=selected_menu.id}"
                                aria-current="page" @click="click_menu(item.menu_id)">
                                {{ item.menu_nm }}
                            </a>
                        </li>
                    </ul>
                    <div class="d-flex" id="login-info">
                        <button class="btn btn-outline-success" v-if="!is_login">회원가입</button>
                        <button class="btn btn-outline-success" v-if="!is_login">로그인</button>
                        <span v-if="is_login" class="navbar-text">사용자:박상훈</span>
                    </div>
                </div>
            </div>
        </nav>
        <div id="app">
            <div id="grid"></div>
            <button class="btn btn-success" v-bind:class="{'disabled':auth_check('삭제')}">삭제</button>
        </div>
    </div>
</template>

<script>

export default {
  name: 'Header',
  data () {
    return {
      selected_menu: {
        id: '',
        auth: []
      },
      menu: []
    }
  }
}
</script>
