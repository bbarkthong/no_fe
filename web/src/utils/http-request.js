import axios from 'axios'

// const DEBUG = process.env.NODE_ENV === 'development'

// https://velog.io/@cateto/vue.js-Rest-API-Http-MethodGETPOSTPUTDELETE
const service = axios.create({
  baseUrl: 'http://127.0.0.1:8081',
  withCredentials: true,
  timeout: 5000
})

service.interceptors.request.use(
  (config) => {
    const accessToken = localStorage.getItem('accessToken')
    if (accessToken) {
      config.headers.common = { Authorization: `Bearer ${accessToken}` }
    }
    console.log('req:')
    console.log(config)
    return config
  },
  (error) => {
    console.log(error)
    return Promise.reject(error)
  }
)

service.interceptors.response.use(
  (response) => {
    const res = response.data
    return res
  },
  (error) => {
    console.log('err' + error)
    return Promise.reject(error)
  }
)

export default service
