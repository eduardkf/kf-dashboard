<template>
  <q-page class="page-container">
    <div class="split-card-container">
      <div class="split-card">
        <q-card class="split-left" bordered>
          <h2
            class="text-weight-light text-center"
            style="margin: 0; color: white"
          >
            Welcome to KF Dashboard
          </h2>
          <carousel-component :slides="carouselSlides"></carousel-component>
        </q-card>
        <q-card class="split-right">
          <q-img class="toggle-container" src="../assets/kf-logo-small.png" />

          <div class="center-form">
            <div style="max-width: 100%">
              <q-tabs
                v-model="tab"
                align="justify"
                narrow-indicator
                class="q-my-xl"
              >
                <q-tab class="text-primary" name="SignIn">
                  <template v-slot:default>
                    <h2
                      class="text-weight-light text-center"
                      style="color: white"
                    >
                      Sign In
                    </h2>
                  </template>
                </q-tab>

                <q-tab class="text-primary" name="SignUp">
                  <template v-slot:default>
                    <h2
                      class="text-weight-light text-center"
                      style="color: white"
                    >
                      Sign Up
                    </h2>
                  </template>
                </q-tab>
              </q-tabs>
            </div>
            <!-- Form with email, password, and submit button -->
            <div class="q-gutter-y-sm">
              <q-tab-panels
                v-model="tab"
                animated
                transition-prev="slide-right"
                transition-next="slide-left"
                class="transparent"
              >
                <q-tab-panel class="q-ml-xl" style="width: 50vh" name="SignIn">
                  <sign-in-form></sign-in-form>
                </q-tab-panel>
                <q-tab-panel class="q-ml-xl" style="width: 50vh" name="SignUp">
                  <sign-up-form></sign-up-form>
                </q-tab-panel>
              </q-tab-panels>
            </div>
          </div>
        </q-card>
      </div>
    </div>
  </q-page>
</template>

<script setup lang="ts">
import CarouselComponent from 'src/components/carousel/CarouselComponent.vue';
import SignInForm from 'src/components/forms/SignInForm.vue';
import SignUpForm from 'src/components/forms/SignUpForm.vue';
import { ref } from 'vue';

const buttonTogglemodel = ref(true);
const text = ref('');
const tab = ref('SignIn');
const val = ref(true);

const carouselSlides = ref([
  {
    imageSrc: 'src/assets/login-lady.png',
    altText: 'Slide 1',
    title: 'Plan your operation using the KF Dashboard',
  },
  {
    imageSrc: 'src/assets/customer.png',
    altText: 'Slide 1',
    title: 'Connect the customer with the designers',
  },
  {
    imageSrc: 'src/assets/design-login.png',
    altText: 'Slide 1',
    title: 'Plan the design',
  },
  {
    imageSrc: 'src/assets/production-login.png',
    altText: 'Slide 1',
    title: 'Plan and follow the production process',
  },
]);
</script >

<style scoped>
.buttonGroup {
  display: flex;
  flex-direction: row;
}

.center-form {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  min-height: 50%;
}

.toggle-container {
  display: flex;
  flex-direction: column;
  max-width: 40px;
  justify-content: flex-end;
  margin-left: auto;
}

.carousel-style {
  min-height: 80vh;
  width: 50vh;
}

.page-container {
  height: 100vh;
  background: linear-gradient(
    86deg,
    rgba(159, 62, 90, 1) 0%,
    rgba(201, 101, 120, 1) 27%,
    rgba(201, 101, 120, 1) 63%,
    rgba(156, 59, 87, 1) 100%
  );
}

.split-card-container {
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
  width: 100vw;
}

.split-card {
  min-height: 50vh;
  min-width: 100vh;
  display: flex;
}

.split-left,
.split-right {
  flex: 1;
  padding: 20px;
}

.split-left {
  min-height: 70vh;
  max-width: 60vh;
  background: linear-gradient(
    90deg,
    rgba(103, 218, 198, 1) 0%,
    rgba(110, 224, 203, 1) 53%,
    rgba(88, 190, 174, 1) 100%
  );
  border-radius: 20px 0px 0px 20px;
}

.split-right {
  background: linear-gradient(
    86deg,
    rgba(53, 70, 93, 1) 0%,
    rgba(56, 74, 99, 1) 53%,
    rgba(55, 73, 96, 1) 100%
  );
  border-radius: 0px 20px 20px 0px;
  min-height: 70vh;
  max-width: 60vh;
}
</style>
