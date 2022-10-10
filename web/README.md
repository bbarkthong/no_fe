# web

## Project setup
```
npm install
```

### Compiles and hot-reloads for development
```
npm run serve
```

### Compiles and minifies for production
```
npm run build
```

### Lints and fixes files
```
npm run lint
```

### Customize configuration
See [Configuration Reference](https://cli.vuejs.org/config/).

### Bootstrap install 
```
npm install --save bootstrap
```

```
main.js
import 'bootstrap/dist/css/bootstrap.css'
```

### Toast-UI install 

See (https://github.com/nhn/tui.grid/tree/master/packages/toast-ui.vue-grid).

```
npm install --save @toast-ui/vue-grid
```

```
main.js
import 'tui-grid/dist/tui-grid.css'
import 'tui-date-picker/dist/tui-date-picker.css';
import 'tui-time-picker/dist/tui-time-picker.css';
import 'tui-pagination/dist/tui-pagination.css';
import { Grid } from '@toast-ui/vue-grid';
Vue.component('grid',Grid)
```

See (https://www.npmjs.com/package/@toast-ui/vue-editor)
```
npm install --save @toast-ui/vue-editor
```

