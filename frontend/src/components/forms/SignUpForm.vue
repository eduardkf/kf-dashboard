<template>
  <form @submit.prevent="submitForm" class="form-style">
    <q-input
      v-model="fullName"
      class="q-mb-md"
      label-color="white"
      input-class="inputClass"
      label-slot
      input-style="color: white; border-bottom: white"
      color="white"
      stack-label
      bottom-slots
    >
      <template v-slot:label>
        <h4 class="q-pb-md text-weight-light">Full Name</h4>
      </template>
      <template v-slot:hint>
        <div style="font-size: 15px; color: #667282">Enter your Full Name</div>
      </template>
    </q-input>
    <q-input
      v-model="email"
      class="q-mb-md"
      label-color="white"
      input-class="inputClass"
      label-slot
      input-style="color: white; border-bottom: white"
      color="white"
      stack-label
      bottom-slots
    >
      <template v-slot:label>
        <h4 class="q-pb-md text-weight-light">Email</h4>
      </template>
      <template v-slot:hint>
        <div style="font-size: 15px; color: #667282">Enter your email</div>
      </template>
    </q-input>
    <q-input
      v-model="password"
      type="password"
      class="q-my-xl"
      label-color="white"
      input-class="inputClass"
      label-slot
      input-style="color: white; border-bottom: white"
      color="white"
      stack-label
      bottom-slots
    >
      <template v-slot:label>
        <h4 class="q-pb-md text-weight-light">Password</h4>
      </template>
      <template v-slot:hint>
        <div style="font-size: 15px; color: #667282">Enter your password</div>
      </template>
    </q-input>

    <q-checkbox class="q-mb-md" v-model="remember">
      <template v-slot:default>
        <text-body1 style="color: white" class="text-weight-regular">
          Remember log in details
        </text-body1>
      </template>
    </q-checkbox>

    <q-btn type="submit" color="primary" class="q-mb-md" rounded>
      <template v-slot:default>
        <text-body1 style="color: white" class="text-weight-regular">
          Sign Up
        </text-body1>
      </template>
    </q-btn>
  </form>
</template>

<script setup>
import { ref } from 'vue';

const fullName = ref('');
const email = ref('');
const password = ref('');
const remember = ref(false);

const submitForm = () => {
  // Handle Sign Up form submission here
};
</script>

<style>
.form-style {
  display: flex;
  flex-direction: column;
  max-width: 20vw;
  min-width: 80%;
}
</style>
