module.exports = {
    outputDir: "../src/main/resources/static",
    // indexDir: "../src/main/resources/templates/vue",
    devServer: {
        proxy: {
            './api': {
                target: 'http://localhost:8081',
                changeOrigin: true 
            }
        }
    }
};
