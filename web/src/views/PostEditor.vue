<template>
  <div>
    <!-- <editor :initialValue="editorText"
    :options="editorOptions"
    height="500px"
    initialEditType="wysiwyg"
    previewStyle="vertical" /> -->
    <viewer />
  </div>
</template>

<script>
import '@toast-ui/editor/dist/toastui-editor-viewer.css'

import { Viewer } from '@toast-ui/vue-editor'

export default {
  components: {
    viewer: Viewer
  },
  methods: {
    scroll() {
      this.$refs.toastuiEditor.invoke('setScrollTop', 10)
    },
    moveTop() {
      this.$refs.toastuiEditor.invoke('moveCursorToStart')
    },
    getHTML() {
      // let html = this.$refs.toastuiEditor.invoke('getHTML')
    }
  },
  data() {
    return {
      editorText: 'This is initialValue.',
      editorOptions: {
        hideModeSwitch: true
      }
    }
  }
}
</script>

<style>

</style>
