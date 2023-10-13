<template>
  <separator-with-text v-if="props.sectionStart" :text="props.sectionName" />

  <q-item
    :active-class="props.activeClass"
    :to="props.to"
    exact
    :class="props.class"
    clickable
    v-ripple
  >
    <q-item-section avatar>
      <q-icon style="color: #514d59" :name="props.avatar" />
    </q-item-section>

    <q-item-section style="color: #514d59">
      {{ props.menuItemName }}
    </q-item-section>
  </q-item>
</template>

<script setup lang="ts">
import { defineProps } from 'vue';
import SeparatorWithText from 'src/components/Menu/SeparatorWithText.vue';

const props = defineProps({
  activeClass: String,
  to: String,
  class: String,
  sectionStart: Boolean,
  sectionName: String,
  menuItemName: String,
  avatar: String,
});
</script>
