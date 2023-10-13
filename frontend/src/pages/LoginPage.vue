<template>
  <q-layout>
    <q-page-container>
      <q-page class="backgroundClass flex flex-center">
        <q-card
          class="q-ma-md xs-12 sm-10 md-8 lg-6"
          bordered
          style="border-radius: 20px 20px 20px 20px"
        >
          <q-card-section class="q-ml-md q-pa-lg">
            <div class="row justify-center">
              <div style="color: #514d59" class="text-h4 ellipsis">
                <q-avatar class="col">
                  <img src="https://cdn.quasar.dev/img/boy-avatar.png" />
                </q-avatar>
                Katty Fashion
              </div>
            </div>
            <div class="column q-pt-lg">
              <div
                style="color: #514d59"
                class="row text-weight-regular text-h6"
              >
                Welcome to KF Dashboard! 👋🏻
              </div>
              <div
                style="color: #514d598a"
                class="row text-weight-regular text-subtitle1"
              >
                Please sign-in to your account and start the adventure
              </div>
            </div>
          </q-card-section>
          <q-card-section class="q-ml-md q-mr-md">
            <q-form class="q-gutter-md">
              <q-input rounded v-model="text" label="Username"> </q-input>
              <q-input type="password" v-model="password" label="Password" />
              <div class="row items-center">
                <q-checkbox v-model="val" />
                <div
                  style="color: #514d598a"
                  class="col text-weight-regular text-subtitle1"
                >
                  Remember me
                </div>
                <q-btn
                  flat
                  color="primary"
                  label="Forgot password?"
                  class="no-hover"
                />
              </div>
              <div>
                <q-btn
                  label="Login"
                  to="/main"
                  type="button"
                  color="primary"
                  style="width: 100%"
                />
              </div>
            </q-form>
            <div class="q-mt-md row justify-center items-center">
              <div
                style="color: #514d598a"
                class="column text-weight-regular text-subtitle1"
              >
                New on our platform?
              </div>
              <q-btn
                flat
                color="primary"
                label="Create an account"
                class="column col-6 no-hover"
              />
            </div>
            <div class="text-center col justify-center">
              <separator-with-text class="row q-mt-md" text="or" />
              <i
                class="q-mr-lg q-mt-lg fa-brands fa-google fa-xl"
                style="color: #db4437"
              ></i>
            </div>
          </q-card-section>
        </q-card>
        <q-footer class="backgroundClass"> </q-footer>
      </q-page>
    </q-page-container>
  </q-layout>
</template>

<script type="text/javascript"></script>
<script setup >
import { ref } from 'vue';
import SeparatorWithText from '../components/Menu/SeparatorWithText.vue';

const val = ref(false);
</script>

<style lang="scss">
@use '../css/quasar.variables.scss' as variables;

.login-form {
  position: absolute;
}

.no-hover .q-focus-helper {
  background-color: transparent !important; /* Remove background color on hover */
}

.backgroundClass {
  background-image: url('../assets/loginBackground.png');
  background-size: 100vw; /* Cover the entire element */
  background-position: center bottom; /* Position the image at the center of the bottom */
  background-repeat: no-repeat; /* Do not repeat the image */
}
</style>
